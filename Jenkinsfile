pipeline {

    agent any

    stages {
        stage('Build') {
            steps { //Checking out the repo
                git 'https://github.com/dpanteja/initial.git'
                checkout changelog: true, poll: true, scm: [$class: 'GitSCM', branches: [[name: '*/master']], browser: [$class: 'BitbucketWeb', repoUrl: 'https://web.com/blah'], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'git', url: 'ssh://git@git.giturl.com/test/test.git']]]
                bat gradlew.bat clean build
            }
        }
    }
    post {
        }
    }
}