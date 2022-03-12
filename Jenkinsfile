pipeline {
    agent any
    tools {
        maven 'maven:3.8.4'
    }
    stages {
        stage("build") {
            steps {
                echo 'building the application'
                sh 'mvn clean install -DskipTests'
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