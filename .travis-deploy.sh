#!/usr/bin/env bash

set -o errexit

if [[ ! -f .travis-commit-message.md ]]; then
	echo "Commit message file '.travis-commit-message.md' not found!"
	exit 1
fi

git config --global user.name "Travis CI"
git checkout master
git add .
git commit --file .travis-commit-message.md
git remote rm origin
git remote add origin https://${GH_TOKEN}@github.com/sormuras/modules.git
git push origin master
