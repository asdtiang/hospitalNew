package com.sjzsqjy.www.site

class IndexController {
	def menu={
		def infoType=InfoType.findAllBySequenceGreaterThan (0)
		log.info "menumenu"
		[infoTypeInstanceList:infoType]
	}
	def login={
	}
	/**
	 * 医院简介
	 */
	def hospitalDesc={
		def index1=Info.get(22)
		if(index1.content.length()>700){
			index1.content=index1.content.subSequence(0,700)+"....."
		}
		[index1:index1]
	}
	/**
	 * 仪器滚动
	 */
	def scroll={
		def type=InfoType.get(3)
		[infoTypeInstance:type]
	}
	/**
	 * 企业文化
	 */
	def index2={
		def info=Info.get(3)
		[infoInstance:info]
	}
	/**
	 * 
	 */
	def checkService={
		def type=InfoType.get(2)
		def i=Info.createCriteria()
		def infoList=i.list{
			eq("infoType", type)
			order("dateCreated", "desc")
			maxResults(6)
			firstResult(0)
		}
		infoList.each {
			if(it.title.length()>18){
				it.title=it.title.subSequence(0,17)+"..."
			}
		}
		[infoList:infoList]
	}
	/**
	 * 信息反馈
	 */
	def feedBack={
		def results = FeedBack.listOrderByDateCreated(max:9, offset:0,order:"desc")
		[feedBackInstanceList:results]
	}
	def indexNews={
		def type=InfoType.get(4)
		def i=Info.createCriteria()
		def infoList=i.list{
			eq("infoType", type)
			order("dateCreated", "desc")
			maxResults(6)
			firstResult(0)
		}
        infoList.each {
            if(it.title.length()>18){
                it.title=it.title.subSequence(0,17)+"..."
            }
        }
		[infoList:infoList]
	}
	
	/**
	 * 首页公告滚动
	 */
	def siteNotice={
		
		def info=Info.findByTitle("网站公告")
		
		def str=info.content
		str=str.subSequence(str.indexOf('>')+1,str.lastIndexOf('<'))
		[str:str,id:null==info?1:info.id]
	}
	/**
	 * 网站管理
	 */
	def admin={
	}
	def staIndex={
		if(null==session.shopId){
			flash.message = "请先选择分店"
			redirect (action:'loginAfter',controller:'login')
			return
			}
	}
}


