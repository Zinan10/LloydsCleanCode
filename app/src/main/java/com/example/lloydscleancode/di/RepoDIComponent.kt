package com.example.lloydscleancode.di

import com.example.lloydscleancode.repository.LoginRepository
import org.koin.dsl.module

/**
 * Repository DI module.
 * Provides Repo dependency.
 */
val RepoDependency = module {

    factory {
        LoginRepository()
    }

}