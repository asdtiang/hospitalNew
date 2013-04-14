import com.sjzsqjy.www.data.TestType
import com.sjzsqjy.www.util.StaticMethod
import org.codehaus.groovy.grails.web.servlet.GrailsApplicationAttributes
import com.sjzsqjy.www.auth.HosRole
import com.sjzsqjy.www.auth.HosUser
import com.sjzsqjy.www.auth.HosUserHosRole
import com.sjzsqjy.www.site.ConfigDomain
import com.sjzsqjy.www.statistics.Shop

class BootStrap {
	def springSecurityService
    def freemarkerService
    def init = { servletContext ->
		springSecurityService= servletContext.getAttribute(GrailsApplicationAttributes.APPLICATION_CONTEXT).getBean('springSecurityService')
		createDefaultRoles()
		createDefaultUsers()
		createDefaultData()
		createDefaultConfig()
        initTestType()
		
		def configList =ConfigDomain.findAll()
		def configMap=new HashMap<String,Object>()
		configList.each {
            StaticMethod.addToConfigMap(configMap,it)
		}
		servletContext.configMap=configMap
    }
	/**
	* 创建角色
	* @return
	*/
   def authority = HosRole.findByAuthority('ROLE_ADMIN')
   private createDefaultRoles() {
	   if (!HosRole.findByAuthority('ROLE_USER')) {
		   new HosRole(authority: 'ROLE_USER', description: "网站会员").save(flush: true)
	   }
	   if (!authority) {
		   authority=new HosRole(authority: 'ROLE_ADMIN', description: "管理员")
		   authority.save(flush: true)
	   }

   }
   private createDefaultUsers(){
	   if(!HosUser.findByEmail("asdtiang@qq.com")){
		   def password = springSecurityService.encodePassword("asdtiang_sjz_2011", "asdtiang")
		   def user = new HosUser(email: "asdtiang@qq.com", username: "asdtiang",
				   password: password, accountLocked: false, enabled: true)
		   if (!user.validate() || !user.save()) {
			   log.info "eeeee"
			   user.errors.each { log.info it }
		   }
		   def userAuthority =HosUserHosRole.create(user,authority)
		   if (!userAuthority.save()) {
			   log.info "eeeee"
			   userAuthority.errors.each { log.info it }
		   }
	   }
   }
   def initTestType(){
       TestType.findAll().each {
           freemarkerService.addOrUpdateTemplate(it.id+"",it.content)
       }
    }
   private createDefaultData(){
	   if(!Shop.get(1)){
		   new Shop(name:"默认店",address:"默认地址").save(flush:true);
		   }
	   }
   
   private createDefaultConfig(){

	   }

    def destroy = {
    }
}
