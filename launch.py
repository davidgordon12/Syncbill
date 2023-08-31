import os
from sys import platform

if platform == "linux" or platform == "linux2":
  print("Not supported yet")
elif platform == "darwin":
  print("Not supported yet")
elif platform == "win32":
  # SPRINGBOOT API
  os.chdir('api')
  os.system('mvn install -DskipTests')
  os.system('start mvn spring-boot:run')

  # REACT CLIENT
  os.chdir('../client')
  os.system('npm i')
  os.system('npm run build')
  os.system('npm run preview')