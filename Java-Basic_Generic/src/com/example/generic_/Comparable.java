package com.example.generic_;

public interface Comparable<T> {

}

/**
 * 移除
 * @author 北飞的候鸟
 *
 * @param <T>
 */
@SuppressWarnings("rawtypes")
class Com implements Comparable{
	
}


/**
 * 继承
 * 小于等于
 * @author 北飞的候鸟
 *
 * @param <T>
 */
class Com_<T> implements Comparable<T>{
	
}
/**
 * 父类移除。子类泛型
 * 
 * @author 北飞的候鸟
 *
 * @param <T>
 */
class Com_1<T> implements Comparable<Object> {
	
}