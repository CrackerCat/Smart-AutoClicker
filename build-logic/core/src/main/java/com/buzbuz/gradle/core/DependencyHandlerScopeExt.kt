/*
 * Copyright (C) 2024 Kevin Buzeau
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.buzbuz.gradle.core

import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.implementation(dependency: Provider<MinimalExternalModuleDependency>) =
    add("implementation", dependency)

fun DependencyHandlerScope.playStoreImplementation(dependency: Provider<MinimalExternalModuleDependency>) =
    add("playStoreImplementation", dependency)

fun DependencyHandlerScope.ksp(dependency: Provider<MinimalExternalModuleDependency>) =
    add("ksp", dependency)

fun DependencyHandlerScope.kspTest(dependency: Provider<MinimalExternalModuleDependency>) =
    add("kspTest", dependency)

fun DependencyHandlerScope.testImplementation(dependency: Provider<MinimalExternalModuleDependency>) =
    add("testImplementation", dependency)

fun DependencyHandlerScope.androidTestImplementation(dependency: Provider<MinimalExternalModuleDependency>) =
    add("androidTestImplementation", dependency)