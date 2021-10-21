import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth/auth.guard';
import { BandComponent } from './band/band.component';
import { LoginComponent } from './login/login.component';
import { MovieListComponent } from './movie-list/movie-list.component';

const routes: Routes = [
  // {path: 'movie-list', component: MovieListComponent, canActivate: [AuthGuard]},
  {path: 'band', component: BandComponent, canActivate: [AuthGuard]},
  {path: 'login', component: LoginComponent},
  {path:'', redirectTo: "/login", pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
