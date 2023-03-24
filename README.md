# RestApis
RestApi using SpringBoot
Note:PostgreSql is Used.

1. post "/load"
payload:
{
	"loadingPoint": "delhi",
	"unloadingPoint": "jaipur",
	"productType": "chemicals",
	"truckType": "canter",
	"noOfTrucks": "1",
	"weight": "100",
            optional:"comment": "",
	“shipperId” : “shipper:<UUID>”,
	“Date” : “dd-mm-yyyy”
	
}
Response:loads details added successfully 

      2. GET “/load”

Query params - (shipperId)

Response:list of loads with this shipperId

1. GET “load/{loadId}”
2. PUT “load/{loadId}”
{
	"loadingPoint": "alwar",
	"unloadingPoint": "jaipur",
	"productType": "chemicals",
	"truckType": "canter",
	"noOfTrucks": "1",
	"weight": "100",
            "comment": "",
                       “Date” : “dd-mm-yyyy”	
}
DELETE “load/{loadId}”
