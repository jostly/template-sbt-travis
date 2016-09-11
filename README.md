# Template for SBT, Travis-CI and Bintray

[![](https://travis-ci.org/jostly/template-sbt-travis.svg?branch=master)](https://travis-ci.org/jostly/template-sbt-travis/builds)

## Introduction

This project serves as a template for Scala projects using SBT, with continuous building on [Travis-CI](https://travis-ci.org) and
publishing releases to [Bintray](https://bintray.com/).

## Continuous builds

Will build on most branches (by default, some are excluded by travis) as soon as you push to origin. Building on a non-tag will
only test, and not publish.

## Creating a release

Do `sbt "release with-defaults"` from command line, or `release with-defaults` from within sbt. This will create a tag and push to origin, which
will trigger another build on Travis, on the newly created tag, publishing that version to bintray.

## Credits

I was greatly inspired by this blog post: http://blog.byjean.eu/2015/07/10/painless-release-with-sbt.html
