package org.test.viepagerdi.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import org.test.viepagerdi.di.FragmentScope
import org.test.viepagerdi.ui.main.PageFragment

@Module
abstract class MainModule{

    @FragmentScope
    @ContributesAndroidInjector()
    abstract fun bindPageFragment(): PageFragment
}