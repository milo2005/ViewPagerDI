package org.test.viepagerdi.di.components

import dagger.Module
import dagger.android.ContributesAndroidInjector
import org.test.viepagerdi.di.ActivityScope
import org.test.viepagerdi.di.modules.MainModule
import org.test.viepagerdi.ui.main.MainActivity

@Module
abstract class ActivityComponents{

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun bindMainActivity(): MainActivity

}