dataSource {
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            url = "jdbc:mysql://localhost:3306/hospital_new?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&failOverReadOnly=false"
            pooled = true
            loggingSql = true
            driverClassName = "com.mysql.jdbc.Driver"
            username = "hospital"
            password = "hospitalpw!@"
            dialect = org.hibernate.dialect.MySQL5Dialect
            properties {
                maxActive = 50
                maxIdle = 25
                minIdle = 5
                initialSize = 5
                maxWait = 10000
                validationQuery = "select 1"
                testWhileIdle = true
                timeBetweenEvictionRunsMillis = 3600000
                poolPreparedStatements = true
            }
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE"
        }
    }
    production {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            url = "jdbc:mysql://localhost:3306/hospital_new?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false"
            pooled = true
            loggingSql = true
            driverClassName = "com.mysql.jdbc.Driver"
            username = "hospital"
            password = "hospitalpw!@"
            dialect = org.hibernate.dialect.MySQL5Dialect
            properties {
                maxActive = 50
                maxIdle = 25
                minIdle = 5
                initialSize = 5
                maxWait = 10000
                validationQuery = "select 1"
                testWhileIdle = true
                timeBetweenEvictionRunsMillis = 3600000
                poolPreparedStatements = true
            }
        }
    }
}
