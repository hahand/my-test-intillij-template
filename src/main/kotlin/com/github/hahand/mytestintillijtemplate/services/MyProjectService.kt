package com.github.hahand.mytestintillijtemplate.services

import com.intellij.openapi.project.Project
import com.github.hahand.mytestintillijtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
