package com.example.lloydscleancode.di

import com.example.lloydscleancode.screens.login.LoginUseCase
import org.koin.dsl.module

/**
 * Use case DI module.
 * Provide Use case dependency.
 */
val UseCaseDependency = module {

    factory {
        LoginUseCase()
    }
}