
# Data Structures and Algorithm

Data structure and Algorithm (DSA)


## Contribution Guidelines

### 1. Contribution Specifications
A unit `problem` must conform to the following specifications:

- The name should be in lowercase. (**Eg.** `palindrome/`, `binary-search.cpp` etc.).
- Each word must be separated by a **dash** or a **hyphen** (`-`).

**If you have a problem that belongs to a new _topic_ or _category_ than one which are present:**

#### Simple (File) Contributions

The file should conform to the `problem` specification, and the extension (**Eg.** `linear-search.java`, `kruskal-algorithm.cpp`, `count-inversions.js` etc.)


**Folder Structure**

```dsasheet
arijeet\
| - .gitignore
| - README.md
| - Makefile       # or the specific specification/requirements/configuration file
| - src\
    | - programname\main.ext
```

#### `.gitignore` File

```gitignore
# add all output files and build files to be excluded from git tracking
```

#### Build File / Specification File / Configuration File

It can be any of the following ones

- **C/C++**: `Makefile`
- **Python**: `requirements.txt`
- **JavaScript**: `package.json` and `package-lock.json`
- **Rust**: `Cargo.toml` and `Cargo.lock`
- **Go**: `go.mod`

#### Source Code File

The source code files, should either be in `src/` folder (**Eg.** `src/main.cpp` or `src/main.js`) or the root folder (**Eg.** `palindrome.go` or `App.java`) where `ext` is the file extension for the specific programming language.

Again, the source codes must conform to a valid file structure convention that the programming language enforces.

## Contributors

@emmyari
@cypherpoll-0
@Mykiiii

**For First Time run below two commands in your local machine project directory**

```
    git clone https://github.com/emmyari/dsasheet.git
    git remote add origin https://github.com/emmyari/dsasheet.git 

```

**After cloning & adding remote origin. You can start editing your folder**
**Run below commands to push your changes**

```
    git pull
    git add .
    git status
    git commit -m "Your message goes here"
    git branch -M main 
    git push

```
