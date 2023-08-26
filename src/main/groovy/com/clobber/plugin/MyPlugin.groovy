package com.clobber.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project


class MyPlugin implements Plugin<Project> {
    private static final String TAG = MyPlugin.class.name

    @Override
    void apply(Project project) {
        System.out.println("<<<<$TAG plugin >>>>" + project.getName())
    }
}