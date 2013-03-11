package org.asdtiang.grails.taglib

class MyTagTagLib {
	def checkBoxListItem = {attrs, body ->
		
		def from = attrs.from 
		def value = attrs.value 
		def cname = attrs.name 
		def isChecked, ht, wd, style, html
		def lineTotal = attrs.lineCount as int
		// sets the style to override height and/or width if either of them // is specified, else the default from the CSS is taken 
		style = "style='" 
		if(attrs.height) style += "height:${attrs.height};" 
		if(attrs.width) style += "width:${attrs.width};"
		
		if (style.length() == "style='".length()) style = "" else style += "'" // closing single quote
		
		int i=0
		from.each { obj ->
			
			// if we wanted to select the checkbox using a click anywhere on the label (also hover effect) // but grails does not recognize index suffix in the name as an array: // 
			//cname = "${attrs.name}[${idx++}]" // and put this inside the li: <label for='$cname'>...</label>
			i++
			out << '<input type="checkbox" id="'<<obj.id<<'" value="'<<obj.name<<'" onchange="changePrice(this)" name="items">' << obj."${attrs.optionKey}"
			out <<"￥<label id='money${obj.id}'>"<<obj."${attrs.optionValue}" <<"</label>&nbsp;&nbsp;&nbsp;"
			if(i%lineTotal==0){
				out<<"<br></br>"
			}
			}
		
		
		
	}
	
}
