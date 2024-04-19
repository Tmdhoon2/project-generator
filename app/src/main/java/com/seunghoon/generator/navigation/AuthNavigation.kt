package com.seunghoon.generator.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation

internal fun NavGraphBuilder.auth() {
    navigation(
        route = NavigationRoute.Auth.route,
        startDestination = NavigationRoute.Auth.SPLASH,
    ) {

    }
}
