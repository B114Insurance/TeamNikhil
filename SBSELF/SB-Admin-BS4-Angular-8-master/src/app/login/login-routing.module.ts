import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login.component';
import { AhModule } from '../layout/ah/ah.module';
import { OeModule } from '../layout/oe/oe.module';
import { SeModule } from '../layout/se/se.module';
import { SalesagentModule } from '../layout/salesagent/salesagent.module';
import { RoleComponent } from './role/role.component';
import { AdminModule } from '../layout/admin/admin.module';

const routes: Routes = [
    {
        path: '',
        component: LoginComponent
    },
    {
        path: 'role',
        component: RoleComponent,
        children: [
            { path: 'ah', loadChildren: () => AhModule },
            { path: 'oe', loadChildren: () => OeModule },
            { path: 'se', loadChildren: () => SeModule },
            { path: 'sales', loadChildren: () => SalesagentModule },
            { path: 'admin', loadChildren: () => AdminModule }
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class LoginRoutingModule {}
