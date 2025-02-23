pipeline {
    agent any
    
    // Configure poll SCM trigger
    triggers {
        pollSCM 'H/15 * * * *'
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building application...'
                // Add build commands here
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