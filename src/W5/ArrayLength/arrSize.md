## 베열의 크기
- length 사용

---
- 1차원 배열과 문자열의 크기
```java
public class Array{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = "abcde";
        System.out.println(arr.length); // 3
        System.out.println(str.length()); // 5
    }
}
```
- 배열.length는 ( ) 괄호를 붙이지 않고
- 문자열.legnth()는 ( ) 괄호를  붙여 주어야 한다.
---
- 2차원 배열의 크기

![2차원 배열](2차원배열%20사진.png)
- row(행)와 column(열)을 가지고 있고
row가 각각 다른 개수의 column을 가지고 있을 때
***가변길이 배열(Jagged Array)*** 라고 한다.


- 첫번쨰 row는 3개의 column을,
- 두번쨰 row는 2개의 column을,
- 세번째 row는 4개의 column을 가지고 있다.

1. row길이, 각 row별 원소 갯수(= column의 길이) 구하기

```java
public class ArrayLength {
    public static void main(String[] args) {
        String[][] arr = {
                {"A","B","C"},
                {"D","E"},
                {"F","G","H","I"}
        };
        // row의 길이
        System.out.println(arr.length); // 3
        
        // 각 row의 column 길이
        System.out.println(arr[0].length);  // 3
        System.out.println(arr[1].length);  // 2
        System.out.println(arr[2].length);  // 4
    }
}
```

2. 반복문을 사용하여 row별 원소의 갯수(= column의 길이) 구하기
```java
public class ArrayLength {
    public static void main(String[] args) {
        String[][] arr = {
                {"A","B","C"},
                {"D","E"},
                {"F","G","H","I"}
        };
        // row의 길이
        System.out.println(arr.length); // 3
        
        // 각 row의 column 길이
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].length);
        }
    }
}
```
