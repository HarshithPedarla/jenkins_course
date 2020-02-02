job('NodeJS example'){
scm{
    git('git://github.com/HarshithPedarla/jenkins_course.git'){node ->
          node /gitConfigName('DSL User')
          node /gitConfigEmail('harshith@gmail.com')
    }
    }
    triggers{
    scm('H/5 * * * *')
    }
    wrappers{
    nodejs('nodejs')
    }
    steps{
    shell("npm install")
    }
}
