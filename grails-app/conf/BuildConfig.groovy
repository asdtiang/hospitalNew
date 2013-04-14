grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.plugins.dir="plugins"
grails.work.dir="work"
grails.project.war.file = "target/${appName}.war"
//-${appVersion}

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
        mavenRepo "https://oss.sonatype.org/content/repositories/snapshots/"
        // uncomment these to enable remote dependency resolution from public Maven repositories
        //mavenCentral()
        //mavenLocal()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        compile "org.grails:grails-core:2.2.2.BUILD-SNAPSHOT", { exclude "grails" }
        compile 'freemarker:freemarker:2.3.9'
        //; runtime 'mysql:mysql-connector-java:5.1.21'
    }

    plugins {

        compile ":jquery-ui:1.8.24"
        runtime ":jquery:1.8.3"
        compile ":ckeditor:3.6.3.0"
        compile ":famfamfam:1.0.1"
        compile ":richui:0.8"
        compile ":spring-security-core:1.2.7.3"
        compile ":spring-security-ui:0.2"
        compile ":mail:1.0.1"
        
        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0"
        //runtime ":cached-resources:1.0"
        //runtime ":yui-minify-resources:0.1.4"
        runtime ":paginate-ajax:0.1"
        runtime ":hibernate:$grailsVersion"
               runtime ":resources:1.1.6"

               // Uncomment these (or add new ones) to enable additional resources capabilities
               //runtime ":zipped-resources:1.0"
               //runtime ":cached-resources:1.0"
               //runtime ":yui-minify-resources:0.1.5"

               build ":tomcat:$grailsVersion"

               runtime ":database-migration:1.3.2"

               compile ':cache:1.0.1'
    }
}
