import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable

fun main(args: Array<String>) {
	val observable: Disposable = Observable.just("Hello", "RxJava", "World")
		.map { input -> input.uppercase() }
		.filter { input -> input.startsWith("R")}
		.subscribe(
			{ value -> println(value) },
			{ error -> println(error) },
			{ println("Completed!") }
		)
	
	// Creating an Observer
	
}