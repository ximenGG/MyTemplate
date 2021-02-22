package com.github.ximengg.mytemplate.services

import com.github.ximengg.mytemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
