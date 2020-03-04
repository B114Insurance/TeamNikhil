import { Branch } from './Branch.Custommodel';
import { insuranceCompany } from './insuranceCompany.Custommodel';

export class Department{

    deptId:number;
    deptName:string;
    deptLedger:string;
    company:insuranceCompany;
    branch:Branch;
}