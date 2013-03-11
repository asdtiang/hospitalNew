package com.sjzsqjy.www.statistics
import groovy.sql.Sql
class TranController {
	def index={
		def itemList=Item.list();
		def sql=Sql.newInstance("jdbc:mysql://localhost:3306/hospital_sta",
			"root",
			"123",
			'com.mysql.jdbc.Driver')
		
		def item
		for(int i=0;i<itemList.size();i++){
			item=itemList[i];
			item.data.each { 
				sql.execute """insert into
					item_data(item_data_id,date_id
					) values (${item.id}, ${it.id}
					);"""
				}
			}
	}
	
	
}

