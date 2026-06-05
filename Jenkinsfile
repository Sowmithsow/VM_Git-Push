pipeline {
 agent any
 tools{
	maven 'Maven3'
 }
 stages{
	stage('Checkout'){
		steps{
			git branch:'master',
			url:'https://github.com/Sowmithsow/VM_Git-Push.git'
		}
	}
	stage('Build(Skip Tests)'){
		steps{
			bat 'mvn clean install -DskipTests'
		}
	}
	stage('Docker Build'){
		steps{
			bat 'docker build --no-cache -t cucumber-framework .'
		}
	}
	stage('Docker Run (Execute Tests)'){
		steps{
			bat 'docker run --rm cucumber--framework'
		}
	}
 }
 post{
	success{
		echo 'Build Successful-All tests passed'
	}
	failure{
		echo 'Build Failed-Check logs for errors'
	}
	always{
		echo 'Pipeline execution completed'
	}
 } 
}
