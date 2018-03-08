package main

import (
	"github.com/flowcommerce/tools/executor"
	"github.com/flowcommerce/tools/scala_library"
)

func main() {
	executor := executor.Create("lib-reference-scala-json")
	executor = executor.Add("go get -u github.com/flowcommerce/json-reference/common")
	executor = executor.Add("go run script/generate.go")
	executor.Run()

	scala_library.Run()
}
