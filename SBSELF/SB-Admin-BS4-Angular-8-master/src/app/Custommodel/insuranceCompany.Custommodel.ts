import { Address } from './Address.Custommodel';


export class insuranceCompany{

companyName:string;
companyMobileno:string;
companyWebsite:string;
companyEmail:string;
companyLocation:string;
companyFax:string;
address:{
   addressId:number;
   buildingNo:string;
   areaName:string;
   city:{

        cityId:number;
        cityName:string;
        cityCode:string;
        state:{
                stateId:number;
                stateName:string;
                stateCode:string;
                country:{
                        countryId:number;
                        countryName:string;
                        countryCode:string;
                }
        }

   }
        
    
}

}
