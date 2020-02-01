package com.mykoelias.notekeeper

object DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    fun addNote(course: CourseInfo, noteTitle: String, noteText: String): Int {
        val note = NoteInfo(course, noteTitle, noteText)
        notes.add(note)
        return notes.lastIndex
    }

    fun findNote(course: CourseInfo, noteTitle: String, noteText: String) : NoteInfo? {
        for (note in notes)
            if (course == note.course &&
                    noteTitle == note.title &&
                    noteText == note.text)
                return note

        return null
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "java_core", title = "Java Fundamentals: The Core Plataform")
        courses.set(course.courseId, course)
    }

    fun initializeNotes() {
        var note = NoteInfo(course = courses.getValue(key = "android_intents"), text = "this is android intents text", title = "this is a title to android intents")
        notes.add(note)

        note = NoteInfo(course = courses.getValue(key = "android_async"), text = "this is a android async text but this text is so big then the first text", title = "this is a title to android async but this text is so big then your text")
        notes.add(note)

        note = NoteInfo(course = courses.getValue(key = "java_lang"), text = "this is a java lang something", title = "this is a java lang title")
        notes.add(note)

        note = NoteInfo(course = courses.getValue(key = "java_lang"), text = "this is other java lang something", title = "this is other java lang title")
        notes.add(note)

        note = NoteInfo(course = courses.getValue(key = "java_core"), text = "this is a java core", title = "this is a java core tital")
        notes.add(note)

        note = NoteInfo(course = courses.getValue(key = "android_async"), text = "this is a android async", title = "this is a android async title")
        notes.add(note)

        note = NoteInfo(course = courses.getValue(key = "android_intents"), text = "this is more one android intents something", title = "this is android intents title")
        notes.add(note)
    }
}