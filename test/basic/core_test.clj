(ns basic.core-test
  (:require [clojure.test :refer :all]
            [basic.core :refer :all]))

(deftest a-test
  (testing "Response code should be 200 and text should be Hello, world"
    (let [req {}
          resp (app req)]
      (is (= 200 (:status resp)))
      (is (= "Hello, world" (:body resp))))))
