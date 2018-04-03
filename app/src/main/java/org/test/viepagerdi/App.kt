package org.test.viepagerdi

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import org.test.viepagerdi.di.AppInjector
import javax.inject.Inject

class App:Application(), HasActivityInjector{

    @Inject
    lateinit var injector:DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = injector

}