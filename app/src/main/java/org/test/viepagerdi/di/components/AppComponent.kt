package org.test.viepagerdi.di.components

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import org.test.viepagerdi.App
import org.test.viepagerdi.di.modules.AppModule
import org.test.viepagerdi.di.modules.ViewModelModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ActivityComponents::class,
    AppModule::class,
    ViewModelModule::class
])
interface AppComponent {

    fun inject(app: App)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }


}