package com.example.hiltpractice

import javax.inject.Inject


class Foo @Inject constructor(val bar: Bar) {}