import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { RouterModule } from '@angular/router';

import { AddNewTrackComponent } from './add-new-track/add-new-track.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    RouterModule.forChild([
      {
        path: '',
        component: AddNewTrackComponent
      }
    ])
  ],
  declarations: [AddNewTrackComponent]
})
export class ListPageModule {}
