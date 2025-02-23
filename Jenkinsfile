pipeline {
    agent any
    
    // Configure poll SCM trigger
    triggers {
        pollSCM 'H/15 * * * *'
    }

    tools {
        maven "maven3"
        jdk "jdk-21.0.5"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url:'https://github.com/Vinhcognito/ci-pipe1.git'
            }
        }
        
        stage('Maven Build') {
            steps {
                bat "mvn clean compile"
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add test commands here
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Add deployment commands here
            }
        }
    }
}