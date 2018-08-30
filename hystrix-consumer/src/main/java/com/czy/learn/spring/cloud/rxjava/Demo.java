package com.czy.learn.spring.cloud.rxjava;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by chenzhiyuan on 2018/8/21.
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("completed");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("error");
            }

            @Override
            public void onNext(String s) {
                System.out.println(s);
            }
        };
        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("one");
                subscriber.onNext("two");
                subscriber.onNext("three");
                subscriber.onCompleted();
            }
        });
        observable.subscribe(observer);

        Observable.just(1,2,3,4)
                .subscribeOn(Schedulers.io()) //指定事件产生的线程
                .observeOn(Schedulers.newThread()) //指定事件消费的线程
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        System.out.println(integer);
                    }
                });
        Thread.sleep(1000);
    }
}
