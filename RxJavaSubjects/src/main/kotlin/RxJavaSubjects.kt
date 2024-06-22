import io.reactivex.rxjava3.subjects.BehaviorSubject;

fun main(args: Array<String>) {
	val subject: BehaviorSubject<String> = BehaviorSubject.create();
	subject.onNext("Hello");
	subject.onNext("RxJava");
	subject.subscribe(
		{ println(it) },
		{ throwable -> println(throwable) },
		{ println("Completed!") }
	);
}