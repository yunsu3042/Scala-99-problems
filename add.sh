#!/bin/bash 


echo $1
dir="_01Lists"
echo "package _01Lists
import java.util.NoSuchElementException

object P$1 {

}" > ./src/main/scala/$dir/"P$1.scala"

echo "package _01Lists

import org.scalatest.{FunSpec, Matchers}

class P$1Test extends FunSpec with Matchers {

}
" > ./src/test/scala/$dir/"P$1Test.scala"

