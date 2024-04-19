package com.seunghoon.generator.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation

internal fun NavGraphBuilder.main() {
    navigation(
        route = NavigationRoute.Main.route,
        startDestination = NavigationRoute.Root.route,
    ) {

    }
}
