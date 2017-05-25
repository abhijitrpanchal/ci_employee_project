node('maven') {
  stage('Build') {
    git url: "https://github.com/abhijitrpanchal/ci_employee_project.git"
    sh "mvn package"
    stash name:"jar", includes:"target/employee-projects-0.0.1-SNAPSHOT.jar"
  }
  stage('Build Image') {
    unstash name:"jar"
    sh "oc start-build  CIPROJECTDETAILS --from-file=target/employee-projects-0.0.1-SNAPSHOT.jar --follow"
  }
  stage('Deploy') {
    openshiftDeploy depCfg: 'ciprojectdetails'
    openshiftVerifyDeployment depCfg: 'ciprojectdetails', replicaCount: 1, verifyReplicaCount: true
  }
  stage('System Test') {
    sh "curl -s -X POST http://ciprojectdetails-microservices-devops.cloudapps.test.openshift.opentlc.com/projects/1"
    sh "curl -s http://ciprojectdetails-microservices-devops.cloudapps.test.openshift.opentlc.com/projects/1 | grep 'Dummy Project'"
  }
}
