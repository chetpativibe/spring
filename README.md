# Compiling and running di

- `rm -rf classes`
- `javac --release 8 -cp "libs/*" -d classes src/com/mikadosolutions/training/spring/di/*.java`
- `java -cp "classes:libs/*" com.mikadosolutions.training.spring.di.LaunchTraining`