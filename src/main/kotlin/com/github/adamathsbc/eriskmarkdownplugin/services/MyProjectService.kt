package com.github.adamathsbc.eriskmarkdownplugin.services

import com.intellij.openapi.project.Project
import com.github.adamathsbc.eriskmarkdownplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
