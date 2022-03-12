pipeline {
    agent any
    stages {
        stage("build") {
            steps {
                ecgo 'building the application'
                sh 'mvn clean install'
            }
        }
        stage("test") {
            steps {
                echo "test stage ..."
            }
        }
        stage("deploy") {
            steps {
                echo "deploy stage ..."
            }
        }
    }
}