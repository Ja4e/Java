public class main{
  static 
}


// use java 17

https://gist.github.com/skyl/36563a5be809e54dc139


cd ~

git clone https://github.com/Homebrew/brew homebrew

mkdir ~/usr/local

# installed packaged directory

echo “export HOMEBREW_PREFIX=~/usr/local” >> ~/.zshrc

echo “export PATH=$PATH:~/homebrew/bin:HOMEBREW_PREFIX/bin” >> ~/.zshrc
