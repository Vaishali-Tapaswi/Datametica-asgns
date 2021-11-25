**************************** GIT core concepts : ****************************************************
  --> Git maintains log of all commits.
  --> Git keeps snapshots of the entire state of project.
  --> Every check-in version of the overall code has a copy of each file in it.
   


>>>>>>>> Three areas of GIT repositories :
  1) Working Tree :
	--> This area contains local repository on which actual working files are present.
	--> In this working tree, we add new files, we do modifications in files, etc.
	
  2) Staging Area
	--> Files which are ready for commit are added to staging area.
	--> Files added in staging area are then commited using commit command.

  3) History
	--> After commit, the commited files are in history.
	--> History contains all commits done on the repository.

>>>>>>> Git commands to deploy your local repository on github:
  1) git remote add origin "<url>" :
	-> This command set "origin" as a key for mentioned github repository.

  2) git push -u origin master : 
	-> This command push the latest commits to github repository in "master" branch.

  --> After executing above commands, git will ask you your username and password.
  --> Password is the same personal access token generated before.
  --> After giving correct username and password, the local commits are pushed to the remote github repository.

  3) git pull "<url>" :
	-> This command pulls all files and folders from remote github repository to our local machines


>>>>>> Git Branch commands :
  --> git branch :
	-> This command lists all branches present for repository.

  --> git branch <bramch-name> :
	-> This command creates new branch for the repository.

  --> git branch remove <branch-name> :
	-> This command removes perticular branch.


>>>>>>> Connecting Local Repository with Remote Repository :
  --> To push the files from local repository to remote repository, personal access authentication is required.
  
  --> How to set personal access key? :
	-> Open github, goto settings->Authentication.
	-> In authentication goto "developer settings"->"personal access token"->"generate new token".
	-> Now, the token will be generated and this token is used everytime whenever the code is push from local to remote repository.
 	-> This token has expiry.


