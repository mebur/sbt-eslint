sbt-eslint
==========

[![Build Status](https://api.travis-ci.org/mebur/sbt-eslint.png?branch=master)](https://travis-ci.org/mebur/sbt-eslint)

Allows ESLint to be used from within sbt. Builds on com.typesafe:js-engine in order to execute eslint.js
along with the scripts to verify. js-engine enables high performance linting given parallelism and native
JS engine execution.

Usage:

Add dependency to sbt (along with the resolver to BinTray):

```sbtshell
resolvers += Resolver.bintrayIvyRepo("sisyfos-digital", "sbt-plugins")
addSbtPlugin("se.sisyfosdigital.sbt" % "sbt-eslint" % "1.0.6")
    
Install eslint, either globally with npm:

```shell
npm install eslint -g
```

Or locally in your project with a `package.json` file:

```json
{
  "devDependencies": {
    "eslint": "5.8.0"
  }
}
```

By default linting occurs at compile time as part of your project's `eslint` task. Both src/main/assets/\*\*/\*.js and
src/test/assets/\*\*/\*.js sources are linted.

Options can be specified in accordance with the
[ESLint website](http://eslint.org/) and they share the same set of defaults. To set an option you can
provide a `.eslintrc` file within your project's base directory.
