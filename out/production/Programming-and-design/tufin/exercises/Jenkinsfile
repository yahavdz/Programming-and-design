node() {
	stage("Build image") {
		checkout scm
		def myImg = docker.build 'zip-job:1'
		
		myImg.inside() {
			sh "ls /tmp"
			sh "python /tmp/zip_job.py"
			sh "ls"
		}
	}
}