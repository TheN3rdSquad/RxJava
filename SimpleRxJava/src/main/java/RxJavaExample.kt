import io.reactivex.rxjava3.core.Observable;

fun main(args: Array<String>) {
	val observable: Observable<String> = Observable.just("Hello", "RxJava", "World")
		
	// Subscribing Observer to Observable
	observable.subscribe(System.out::println);
}