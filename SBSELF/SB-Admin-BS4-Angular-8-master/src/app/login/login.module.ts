import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TranslateModule } from '@ngx-translate/core';

import { LoginRoutingModule } from './login-routing.module';
import { LoginComponent } from './login.component';
import { RoleComponent } from './role/role.component';
import { SidebarComponent } from '../layout/components/sidebar/sidebar.component';
import { HeaderComponent } from '../layout/components/header/header.component';
import { NgbCarouselModule, NgbAlertModule } from '@ng-bootstrap/ng-bootstrap';
import { StatModule } from '../shared';
// import { TimelineComponent, NotificationComponent, ChatComponent } from '../layout/dashboard/components';
import { FormsModule } from '@angular/forms';

@NgModule({
    imports: [
        CommonModule,
        TranslateModule,
        LoginRoutingModule,
        NgbCarouselModule,
        NgbAlertModule,
        // DashboardRoutingModule,
        StatModule,
        FormsModule
    ],
    declarations: [LoginComponent, RoleComponent, SidebarComponent, HeaderComponent]
})
export class LoginModule {}
