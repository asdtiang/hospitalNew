class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
        "/updateData/index"(controller: "updateData", parseRequest: true) {
            action = [GET: "index", POST: "index"]
        }

		"/"(view:"/index")
		"500"(view:'/error')
        "404"(view:'/errors/404')
	}
}
